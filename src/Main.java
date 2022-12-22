import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.Math;


public class Main {

    public static long[] _randomArray( int _totalNumbers , int _maxNumbers )
    {

        long[] _newArray = new long[_totalNumbers];

        for ( int i = 0 ; i < _totalNumbers ; i++ )
        {
        int _newRandomNumber = (int) (Math.random() * _maxNumbers);
        _newArray[i] = _newRandomNumber;
        }

        return _newArray;
    }

    public static void _printArray( long[] _array )
    {
        System.out.println();
        System.out.print("[");
        int i = 0;
        for(long _number: _array)
        {
            System.out.print(_number);
            i++;
            if (i != (_array.length ))
            {
                System.out.print(",");
            }


        }
        System.out.print("]");
    }

    public static long[] _bubbleSort( long[] _unsortedArray)
    {
        for ( int n = _unsortedArray.length ; n > 1 ; n--)
        {
            for ( int i = 0 ; i < (n-1) ; i++)
            {
                if ( _unsortedArray[i] > _unsortedArray[i+1])
                {
                    long _temp = _unsortedArray[i];
                    _unsortedArray[i] = _unsortedArray[i+1];
                    _unsortedArray[i+1] = _temp;

                }
            }
        }

        return _unsortedArray;


    }

    public static double _averageValue ( long[] _array)
    {
    long _sum = 0;
    int _arrayLength = _array.length;

        for ( long _number: _array )
        {
            _sum += _number;
        }

        return ( (double) _sum / (double) _arrayLength);
    }

    public static double _variance ( long[] _array)
    {
        double _result1 = 0;
        double _result2;

        double _average = _averageValue( _array );

        for ( long _number : _array )
        {
            _result1 += Math.pow( _number - _average , 2);
        }

        _result2 = _result1 / _array.length;

        return _result2;

    }

    public static void main(String[] args) throws FileNotFoundException {

        int _totalNumbers = 10;
        int _maxNumbers = 100;

        long[] _array;

        PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
        System.setOut(out);

        _array = _randomArray(_totalNumbers,_maxNumbers);
        _printArray(_array);
        _printArray(_bubbleSort(_array));
        System.out.println();
        System.out.println("average value: " + _averageValue(_array));
        System.out.println("variance: " + _variance(_array));


    }
}