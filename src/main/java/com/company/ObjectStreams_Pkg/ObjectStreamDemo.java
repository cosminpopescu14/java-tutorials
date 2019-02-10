package com.company.ObjectStreams_Pkg;

import java.math.BigDecimal;
import java.io.*;
import java.util.Calendar;

class ObjectStreamDemo
{
    static final String dataFile = "invoicedata.abcdefg";
    static final BigDecimal[] prices = {
            new BigDecimal("19.99"),
            new BigDecimal("9.99"),
            new BigDecimal("15.99"),
            new BigDecimal("3.99"),
            new BigDecimal("4.99")
    };

    static final int[] units = { 12, 8, 13, 29, 50 };
    static final String[] descs = { "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain 1" };

    private ObjectOutputStream out = null;
    private ObjectInputStream in = null;


    void writeObject() throws IOException
    {
        try
        {
            out = new ObjectOutputStream(new
                    BufferedOutputStream(new FileOutputStream(dataFile)));

            out.writeObject(Calendar.getInstance()); //write the calendar object

            for (int i = 0;  i < prices.length; i++)
            {
                out.writeObject(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        }
        finally
        {
            if (out == null)
            {
                System.err.println("out object is null");
            }
            out.close();
        }
    }

    void readObject() throws IOException, ClassNotFoundException //
    {
        try
        {
            in = new ObjectInputStream(new
                    BufferedInputStream(new FileInputStream(dataFile)));

            Calendar date;
            BigDecimal price;
            int unit;
            String desc;
            BigDecimal total = new BigDecimal(0);

            date = (Calendar)in.readObject();
            System.out.format ("On %tA, %<tB %<te, %<tY:%n", date);

            try
            {
                while (true)
                {
                    price = (BigDecimal)in.readObject();
                    unit = in.readInt();
                    desc = in.readUTF();

                    System.out.format("You ordered %d units of %s at $%.2f%n",
                            unit, desc, price);

                    total = total.add(price.multiply(new BigDecimal(unit)));

                }
            }
            catch (EOFException e) {}
            System.out.format("For a TOTAL of: $%.2f%n", total);
        }
        finally
        {
            if (in == null)
            {
                System.err.println("in obj is null");
            }
            in.close();
        }
    }
}
