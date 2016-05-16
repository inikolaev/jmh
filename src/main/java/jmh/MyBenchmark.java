package jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

/**
 * Created with IntelliJ IDEA.
 * User: inikolaev
 * Date: 5/16/16
 * Time: 8:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyBenchmark {
    @Benchmark
    @Fork(2)
    @Warmup(iterations = 5)
    @Measurement(iterations = 5)
    public void testOneVar(Blackhole blackhole) {
        double i1 = 0.23;

        for (int i = 0; i < 100000000; i++) {
            i1 = i1 * i1;
        }

        blackhole.consume(i1);
    }

    @Benchmark
    @Fork(2)
    @Warmup(iterations = 5)
    @Measurement(iterations = 5)
    public void testTwoIndependentVars(Blackhole blackhole) {
        double i1 = 0.23;
        double i2 = 0.34;

        for (int i = 0; i < 100000000; i++) {
            i1 = i1 * i1;
            i2 = i2 * i2;
        }

        blackhole.consume(i1);
        blackhole.consume(i2);
    }

    @Benchmark
    @Fork(2)
    @Warmup(iterations = 5)
    @Measurement(iterations = 5)
    public void testTwoDependentMultiplicationsSameVar(Blackhole blackhole) {
        double i1 = 0.34;

        for (int i = 0; i < 100000000; i++) {
            i1 = i1 * i1;
            i1 = i1 * i1;
        }

        blackhole.consume(i1);
    }

    @Benchmark
    @Fork(2)
    @Warmup(iterations = 5)
    @Measurement(iterations = 5)
    public void testMultipleIndependentVars(Blackhole blackhole) {
        double i1 = 0.34;
        double i2 = 0.34;
        double i3 = 0.34;
        double i4 = 0.34;

        for (int i = 0; i < 100000000; i++) {
            i1 = i1 * i1;
            i2 = i2 * i2;
            i3 = i3 * i3;
            i4 = i4 * i4;
        }

        blackhole.consume(i1);
        blackhole.consume(i2);
        blackhole.consume(i3);
        blackhole.consume(i4);
    }

    @Benchmark
    @Fork(2)
    @Warmup(iterations = 5)
    @Measurement(iterations = 5)
    public void testTooManyIndependentVars(Blackhole blackhole) {
        double i1 = 0.34;
        double i2 = 0.34;
        double i3 = 0.34;
        double i4 = 0.34;
        double i5 = 0.34;
        double i6 = 0.34;
        double i7 = 0.34;
        double i8 = 0.34;
        double i9 = 0.34;
        double i10 = 0.34;
        double i11 = 0.34;
        double i12 = 0.34;
        double i13 = 0.34;
        double i14 = 0.34;

        for (int i = 0; i < 100000000; i++) {
            i1 = i1 * i1;
            i2 = i2 * i2;
            i3 = i3 * i3;
            i4 = i4 * i4;
            i5 = i5 * i5;
            i6 = i6 * i6;
            i7 = i7 * i7;
            i8 = i8 * i7;
            i9 = i9 * i7;
            i10 = i10 * i10;
            i11 = i11 * i11;
            i12 = i12 * i12;
            i13 = i13 * i13;
            i14 = i14 * i14;
        }

        blackhole.consume(i1);
        blackhole.consume(i2);
        blackhole.consume(i3);
        blackhole.consume(i4);
        blackhole.consume(i5);
        blackhole.consume(i6);
        blackhole.consume(i7);
        blackhole.consume(i8);
        blackhole.consume(i9);
        blackhole.consume(i10);
        blackhole.consume(i11);
        blackhole.consume(i12);
        blackhole.consume(i13);
        blackhole.consume(i14);
    }
}
