package com.company.ReadWriteFilesPkg;

import org.intellij.lang.annotations.RegExp;
import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.nio.file.StandardOpenOption.*;

public class ReadWriteAndCreateFiles
{
    private static final Path READ_PATH = Paths.get("C:\\Users\\EOPPINO\\Desktop\\test.txt");
    private static final Path WRITE_PATH = Paths.get("C:\\Users\\EOPPINO\\Desktop\\abc.txt");
    private static final OpenOption[] openOptions = new OpenOption[] {CREATE, APPEND};

    public static void Run() throws IOException
    {
        readByUsingBufferedStreams();
        //writeByUsingBufferedStreams();
        //readFileByUsingStreamIo();
        //createAndWriteAFileUsingStreamIO();
       // createTempFile();
    }

    //refactor to replace the two whiles with something more efficient
    //TODO
    private static void readByUsingBufferedStreams()
    {
        Charset charset = Charset.forName("US-ASCII");
        @RegExp String regexPattern = "[\\\\\\s]";
        Pattern pattern = Pattern.compile(regexPattern);

        try(BufferedReader reader = Files.newBufferedReader(READ_PATH, charset))
        {
            String line;

            while ((line = reader.readLine()) != null)
            {
                Matcher matcher = pattern.matcher(line);

                while (matcher.find())
                {
                    System.out.println(matcher.replaceAll(""));
                }


            }
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    @NotNull
    private static String generateRandomString()
    {
        /*byte[] arr = new byte[256];

        new Random().nextBytes(arr);
        return new String(arr, Charset.forName("UTF-8"));*/

        int leftLimit = 97; //letter a
        int rightLimit = 122; // letter Z
        int lengthOfTargetString = 10;

        Random random = new Random();
        StringBuilder buffer = new StringBuilder(lengthOfTargetString);
        for (int i = 0; i < lengthOfTargetString; i++)
        {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        return buffer.toString();

    }
    private static void writeByUsingBufferedStreams()
    {
        Charset charset = Charset.forName("UTF-8");
        String s = generateRandomString();

        try (BufferedWriter writer = Files.newBufferedWriter(WRITE_PATH, charset))
        {
            writer.write(s, 0, s.length());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void readFileByUsingStreamIo()
    {
        Charset charset = Charset.forName("US-ASCII");

        try (InputStream in = Files.newInputStream(READ_PATH);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in)))
        {
            String line = null;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (IOException e)
        {
            System.err.println(e);
        }
    }

    private static void createAndWriteAFileUsingStreamIO()
    {
        String s = "mmmmm,  hello !!";
        byte[] data = s.getBytes();

        Path p = Paths.get("test_file.txt");

        try (OutputStream outputStream = new BufferedOutputStream(
                Files.newOutputStream(p, openOptions)
        ))
        {
            outputStream.write(data, 0, data.length);
        }
        catch (IOException e)
        {
            System.err.println(e);
        }
    }

    private static void createTempFile() throws IOException
    {
        Path tempFile = Files.createTempFile(null, ".javatut"); //create temp file in default location. location is platform specific
        System.out.format("The temporary file" +
                " has been created: %s%n", tempFile);
    }

}
