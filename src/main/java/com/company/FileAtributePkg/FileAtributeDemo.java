package com.company.FileAtributePkg;

import java.beans.IntrospectionException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.time.temporal.ChronoField;

public class FileAtributeDemo
{
    private static final String PATH = "C:\\Users\\EOPPINO\\Desktop\\New folder\\procexp.exe";
    public static void Run() throws IOException, InterruptedException
    {
        Path filePath = Paths.get(PATH);

        //metadata about files
        BasicFileAttributes basicFileAttributes = Files.readAttributes(filePath, BasicFileAttributes.class);


        System.out.println("creationTime: " + basicFileAttributes.creationTime());
        System.out.println("lastAccessTime: " + basicFileAttributes.lastAccessTime());
        System.out.println("lastModifiedTime: " + basicFileAttributes.lastModifiedTime());

        System.out.println("isDirectory: " + basicFileAttributes.isDirectory());
        System.out.println("isOther: " + basicFileAttributes.isOther());
        System.out.println("isRegularFile: " + basicFileAttributes.isRegularFile());
        System.out.println("isSymbolicLink: " + basicFileAttributes.isSymbolicLink());
        System.out.println("size: " + basicFileAttributes.size());
        System.out.println("key: " + basicFileAttributes.fileKey());

        System.out.println(Files.getOwner(filePath));


        setFilePermision();
        System.out.println("----------------------------------");
        //readPosixFilePermition();

        //setOwner();
        setMimeType();
        readMineType();

    }

    private static void setFilePermision()
    {
        try
        {
            var attributes = Files.readAttributes(Paths.get(PATH), BasicFileAttributes.class);
            var currentTime = System.currentTimeMillis();
            var fileTime = FileTime.fromMillis(currentTime);
            Files.setLastModifiedTime(Paths.get(PATH), fileTime);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    //this don't work on Windows, but doesn't produce any error
    private static void readPosixFilePermition() throws IOException
    {
        Path filePath = Paths.get(PATH);
        PosixFileAttributes posixFileAttributes = Files.readAttributes(filePath, PosixFileAttributes.class);
        System.out.format("%s %s %s%n",
                posixFileAttributes.owner().getName(),
                posixFileAttributes.group().getName(),
                PosixFilePermissions.toString(posixFileAttributes.permissions()));
    }

    //setting a file owner
    private static void setOwner() throws IOException
    {
        Path filePath = Paths.get(PATH);
        UserPrincipal owner =  filePath.getFileSystem().getUserPrincipalLookupService()
                .lookupPrincipalByName("etroral");

        /*Files.setOwner(filePath, owner);*/
        System.out.println(owner.getName());
    }

    //
    private static void setMimeType() throws IOException
    {
        var path = Paths.get(PATH);
        UserDefinedFileAttributeView view = Files
                .getFileAttributeView(path, UserDefinedFileAttributeView.class);

        view.write("user.mimetype", Charset.defaultCharset().encode("application/vnd.microsoft.portable-executable"));
    }

    private static void readMineType() throws IOException
    {
        var p = Paths.get(PATH);
        UserDefinedFileAttributeView view = Files
                .getFileAttributeView(p, UserDefinedFileAttributeView.class);
        String name = "user.mimetype";

        ByteBuffer buffer = ByteBuffer.allocate(view.size(name));
        view.read(name, buffer);
        buffer.flip();
        System.out.println(Charset.defaultCharset().decode(buffer).toString());
    }
}
