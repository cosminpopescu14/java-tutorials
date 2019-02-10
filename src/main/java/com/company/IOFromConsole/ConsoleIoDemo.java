package com.company.IOFromConsole;

import java.util.Arrays;
import java.io.IOException;

import java.io.Console;

class ConsoleIoDemo
{
    static void SetPassword() throws IOException
    {
        Console console = System.console();
        if (console == null)
        {
            System.err.println("No console.");
            System.exit(1);
        }

        String login = console.readLine("Enter your login: ");
        char[] oldPassword = console.readPassword("Enter your old password: ");

        if (Verify(login, oldPassword))
        {
            boolean noMatch;

            do
            {
                char[] newPassword = console.readPassword("Enter your new password: ");
                char[] askNewPasswordAgain = console.readPassword("Enter new password again: ");

                noMatch = !Arrays.equals(newPassword, askNewPasswordAgain);

                if (noMatch)
                {
                    console.format("Passwords don't match. Try again.%n");
                }
                else
                {
                    ChangePassword(login, newPassword);
                    console.format("Password for %s changed.%n", login);
                }

                Arrays.fill(newPassword, ' ');
                Arrays.fill(askNewPasswordAgain, ' ');
            } while (noMatch);

        }

        Arrays.fill(oldPassword, ' ');
    }

    private static boolean Verify(String login, char[] password)
    {
        return true;
    }

    private static void ChangePassword(String login, char[] password)
    {

    }


}
