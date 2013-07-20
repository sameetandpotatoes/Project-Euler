/*************************************************************************
 *  Compilation:  javac Stopwatch.java
 *
 *
 *************************************************************************/

public class Stopwatch { 

    private final long start;

    public Stopwatch() {
        start = System.nanoTime();
    } 

    // return time (in nanoseconds) since this object was created
    public double elapsedTime() {
        long now = System.nanoTime();
        return (now - start) / 100000000.0000;
    } 
}