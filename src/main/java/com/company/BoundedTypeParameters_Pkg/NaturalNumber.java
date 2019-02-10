package com.company.BoundedTypeParameters_Pkg;

class NaturalNumber <T extends Number>
{
    private T n;

    NaturalNumber(T n)
    {
        this.n = n;
    }

    boolean isEven()
    {
        return n.intValue() % 2 == 0; //n poate folosi metodele clasei integer
    }

}
