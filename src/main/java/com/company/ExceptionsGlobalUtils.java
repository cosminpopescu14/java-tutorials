package com.company;


class ExceptionsGlobalUtils
{
    protected static void ShowStackTraceInformation(Exception ex)
    {
        StackTraceElement stackTraceElement[] = ex.getStackTrace();
        for (int i = 0; i < stackTraceElement.length; i++)
        {
            System.err.println(stackTraceElement[i].getFileName()
                + ":" + stackTraceElement[i].getLineNumber()
                + ">> " + stackTraceElement[i].getMethodName() + "()");
        }
    }
}
