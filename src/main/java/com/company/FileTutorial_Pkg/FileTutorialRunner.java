package com.company.FileTutorial_Pkg;

import java.io.IOException;
import java.nio.file.*;

public class FileTutorialRunner
{
    static String path = "C:\\Users\\EOPPINO\\Desktop\\ProcessExplorer";
    public static void Run() throws IOException
    {
        Path path = Paths.get("C:\\Users\\EOPPINO\\Desktop\\ProcessExplorer\\procexp.exe"); //in Windows extension in important


        boolean isRegularExecutableFile = Files.isRegularFile(path) &
                Files.isReadable(path) & Files.isExecutable(path);

        String a = Boolean.toString(isRegularExecutableFile);

        System.out.println(a);



        System.out.println(new com.sun.security.auth.module.NTSystem().getName());

        //deleteFile();
        moveFiles();

    }

    protected static void deleteFile()
    {
        try
        {
            Files.delete(Paths.get(path + "\\Eula - Copy.txt"));

        }
        catch (NoSuchFileException e)
        {
            System.err.format("%s: no such" + " file or directory%n", path);
        }
        catch (DirectoryNotEmptyException e)
        {
            System.err.format("%s not empty%n", path);
        }
        catch (IOException e)
        {
            // File permission problems are caught here.
            System.err.println();
        }
    }

    protected static void checkIfTwoPathsLocateTheSameFile()
    {

    }

    public static void moveFiles() throws IOException
    {
        Files.move(Paths.get(path), Paths.get("C:\\Users\\EOPPINO\\Desktop\\New folder"), StandardCopyOption.REPLACE_EXISTING);
    }


}
