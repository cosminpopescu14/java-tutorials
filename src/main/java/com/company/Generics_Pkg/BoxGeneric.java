package com.company.Generics_Pkg;


//generic class box
class BoxGeneric<T>
{
    private T t; //T - type

    BoxGeneric()
    {

    }

     BoxGeneric(T _t)
    {
        this.t = _t;
    }

     void setT(T t)
    {
        this.t = t;
    }

     T getT()
    {
        return t;
    }
}
