package com.company.PathTutorial_Pkg;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

public class PathRunner
{
    public static void Run()
    {
        Path p = Paths.get("\\Users\\EOPPINO"); //or "C:\\"
        System.out.format("toString: %s%n", p.toString());
        System.out.format("getFileName: %s%n", p.getFileName());
        System.out.format("getName(0): %s%n", p.getName(0));
        System.out.format("getNameCount: %d%n", p.getNameCount());
        System.out.format("subpath(0,2): %s%n", p.subpath(0,2));
        System.out.format("getParent: %s%n", p.getParent());
        System.out.format("getRoot: %s%n", p.getRoot());

        //convert path to uri
        System.out.println("Path -> URI");
        System.out.format("%s%n", p.toUri()); //file:///C:/Users/EOPPINO/

        //to absolut path
        System.out.format("%s%n", p.toAbsolutePath());

        //join to paths
        System.out.format("%s%n", p.resolve("IdeaProjects"));

    }
}
