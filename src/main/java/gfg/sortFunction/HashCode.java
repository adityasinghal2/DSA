package gfg.sortFunction;

import java.io.*;

class HashCode
{

    public String name;
    public int id;

    HashCode(String name, int id)
    {

        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj)
    {

        // checking if both the object references are
        // referring to the same object.
        if(this == obj)
            return true;

        // it checks if the argument is of the
        // type Geek by comparing the classes
        // of the passed argument and this object.
        // if(!(obj instanceof Geek)) return false; ---> avoid.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        // type casting of the argument.
        HashCode geek = (HashCode) obj;

        // comparing the state of argument with
        // the state of 'this' Object.
        return (geek.name == this.name && geek.id == this.id);
    }

    @Override
    public int hashCode()
    {

        // We are returning the Geek_id
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
        System.out.println(this.id);
        return this.id;
    }

}
