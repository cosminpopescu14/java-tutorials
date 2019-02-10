package com.company.DataStreams_Pkg;

import java.io.*;

class DataStreamDemo
{
    static final  String DATA_FILE = "invoice_data";
    static final double[] prices = { 9.99, 9.99, 15.99, 3.99, 4.99 };
    static final int[] units = { 12, 8, 13, 29, 50 };
    static final String[] descs = {

            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    private DataOutputStream out = null;
    private DataInputStream in = null;

    protected void WriteFileWithDataOutputStreams() throws IOException
    {
        try
        {
            out = new DataOutputStream (new BufferedOutputStream(new FileOutputStream(DATA_FILE)));

            for (int i = 0; i < prices.length; i++)
            {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }

        }
        finally
        {
            if (out == null)
            {
                System.err.println("Data output stream null");
            }

            out.close();
        }
    }

    // FIXME: 9/7/2018
    protected void ReadFileWithDataInputStream() throws IOException
    {
        double price;
        int unit;
        String desc;
        double total = 0.0;

        try
        {
            this.in = new DataInputStream(new BufferedInputStream(new FileInputStream(DATA_FILE)));

            /*
                end of file is detected, so no need to check that. while loop will stop
             */
            try
            {
                while (true)
                {
                    price = in.readDouble();
                    unit = in.readInt();
                    desc = in.readUTF();

                    System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                            unit, desc, price);

                    total += unit * price;
                }
            }
            catch (EOFException e)
            {

            }
            System.out.println("-------------------------------");
            System.out.format("For a TOTAL of: $%.2f%n", total);
        }


        finally
        {
            in.close();
        }
    }
}
