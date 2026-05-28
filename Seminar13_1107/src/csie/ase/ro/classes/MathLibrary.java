package csie.ase.ro.classes;

import csie.ase.ro.exceptions.NoValuesException;
import csie.ase.ro.exceptions.NullValidationException;

public class MathLibrary {

    public static int minimumValue(int[] values){
        if( values == null){
            throw new NullValidationException();
        }

        if (values.length == 0){
            throw new NoValuesException();
        }

        int min = values[0];
        for(int value : values){
            if (min > value){
                min = value;
            }
        }
        return min;
    }
}
