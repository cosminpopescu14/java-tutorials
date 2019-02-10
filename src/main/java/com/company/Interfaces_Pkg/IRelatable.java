package com.company.Interfaces_Pkg;


// this (object calling isLargerThan)
// and other must be instances of
// the same class returns 1, 0, -1
// if this is greater than,
// equal to, or less than other
interface IRelatable
{
    int isLargerThan(IRelatable o);
}
