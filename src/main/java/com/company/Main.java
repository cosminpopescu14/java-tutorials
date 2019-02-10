package com.company;



import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.*;

import java.util.logging.*;
import java.util.stream.Collectors;

//TODO - refactor this class
@SuppressWarnings("unchecked")
public class Main {

    private static final Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    private static FileHandler fileTextHandler;
    private static SimpleFormatter fileFormatter;

    public static void main(String[] args) throws IOException {
	// write your code here


        Logger logger = Logger.getLogger(""); //get the logger
        if (logger.getHandlers()[0] instanceof ConsoleHandler) //check if the log handler is console handler
        {
            logger.removeHandler(logger.getHandlers()[0]); //remove the console handler
        }


        fileTextHandler = new FileHandler("log");
        fileFormatter = new SimpleFormatter();
        fileTextHandler.setFormatter(fileFormatter);
        LOGGER.addHandler(fileTextHandler);

        LOGGER.log(Level.INFO, "App started at {0}", LocalDateTime.now());

        String userOption = Console.ReadLine();
        Map<String, String> options = new HashMap<>();

        options.put("bike", "com.company.Bike_Pkg.RunBike");
        options.put("enum", "com.company.Enums_Pkg.EnumRunner");
        options.put("interfaces", "com.company.Interfaces_Pkg.InterfacesRunner");
        options.put("default_interface", "com.company.DefaultInterfaces_Pkg.SimpleTimeClientRunner");
        options.put("using_keyword_super", "com.company.UsingKeywordSuper.Subclass");
        options.put("generics", "com.company.Generics_Pkg.GenericsRunner");
        options.put("generic_methods", "com.company.GenericMethods_Pkg.GenericMethodsRunner");
        options.put("bounded_type_parameters", "com.company.BoundedTypeParameters_Pkg.BoundedTypeParametersRunner");
        options.put("bounded_wildcards", "com.company.BoundedWildcards.BoundedWildcardsRunner");
        options.put("exception", "com.company.Exceptions.ExceptionsRunner");
        options.put("basic_io", "com.company.IO_Pkg.IORunner");
        options.put("tokenize_scanner", "com.company.BreakingIntoTokens_Pkg.ScanXanRunner");
        options.put("io_console", "com.company.IOFromConsole.ConsoleDemoRunner");
        options.put("named_pipe_demo", "com.company.NamedPipes_Pkg.Pipe");
        options.put("ds", "com.company.DataStreams_Pkg.DataStreamsDemoRunner");
        options.put("os", "com.company.ObjectStreams_Pkg.ObjectStreamRunner");
        options.put("path", "com.company.PathTutorial_Pkg.PathRunner");
        options.put("file_tutorial", "com.company.FileTutorial_Pkg.FileTutorialRunner");
        options.put("metadata", "com.company.FileAtributePkg.FileAtributeDemo");
        options.put("read_write_create", "com.company.ReadWriteFilesPkg.ReadWriteAndCreateFiles");
        options.put("lambda", "com.company.LambdaTutorial.LambdaRunner");
        options.put("recursion", "com.company.Recursion");
        options.put("set", "com.company.Collections_Pkg.SetTutorial");
        options.put("opt", "com.company.OptionalTutorial.OptionalTutorial");

        var key = options.get(userOption);

        try
        {
            if (options.containsKey(key) || key == null)
            {
                throw new KeyNotFoundException("The given key was not present in the dictionary");
            }

            Class<?> className = Class.forName(key);
            Method method = className.getMethod("Run");
            LOGGER.info("Called method: " + method.getName());
            method.invoke(null); //invoking a static method
        }

        catch ( ClassNotFoundException    |
                NoSuchMethodException     |
                IllegalAccessException    |
                InvocationTargetException |
                KeyNotFoundException e )
        {
            LOGGER.severe(e.toString());
        }

        Emplyeee ew = new Emplyeee();


        ew.setFullName("Cosmin");
        ew.setFullName("Andrei");
        ew.setAge(45);

        ew.setSalary(1234D);

        Emplyeee e1 = new Emplyeee();
        e1.setAge(56);
        e1.setSalary(12121D);

        List<Emplyeee> eeee = new ArrayList<Emplyeee>();
        eeee.add(ew);
        eeee.add(e1);

        eeee.stream()
                .filter(emplyeee -> emplyeee.getFullName() == "Cosmin")
                .forEach(emplyeee -> System.out.println(emplyeee.getFullName()));

        eeee/*.stream()*/
                .forEach(emplyeee -> System.out.println(eeee.get(1).getFullName()));

        Double totalSalaries = eeee.stream()
                .mapToDouble(Emplyeee::getSalary) //https://docs.oracle.com/javase/8/docs/api/java/util/stream/DoubleStream.html
                .sum();
                /*.collect(Collectors.summingDouble((Emplyeee::getSalary)));*/

        System.out.println(totalSalaries);

        List<String> joinedList = new ArrayList<>();
        joinedList.add("cos");
        joinedList.add("min");

        String joined = joinedList.parallelStream()
                .map(Objects::toString)
                .collect(Collectors.joining("-"));


        System.out.println(joined);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(numbers)
                .filter(number -> number % 4 == 0)
                .forEach(f -> System.out.println(f));



        Runnable runnable = () -> System.out.println("Hello, World from runable !");

        var thread = new Thread(() -> System.out.println("Hello, World!"));
        runnable.run();

        System.out.println(0.1f + 0.2f == 0.3f);


    }
}
