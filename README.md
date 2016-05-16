# JMH Example
This is a simple JMH benchmarks to demonstrate how several independant opertions can be executed in parallel by different ALUs. 

### Building
`mvn clean package`

### Running
Execute the following to get quick results:

`java -jar target/benchmarks.jar -wi 5 -f 2 -i 5`

or simply run with defaults (will take time, go get some coffee):

`java -jar target/benchmarks.jar`

### Results
```
Benchmark                                            Mode  Cnt  Score   Error  Units
MyBenchmark.testMultipleIndependentVars             thrpt    4  4.303 ± 0.502  ops/s
MyBenchmark.testOneVar                              thrpt    4  4.287 ± 0.100  ops/s
MyBenchmark.testTooManyIndependentVars              thrpt    4  1.506 ± 0.124  ops/s
MyBenchmark.testTwoDependentMultiplicationsSameVar  thrpt    4  2.236 ± 0.091  ops/s
MyBenchmark.testTwoIndependentVars                  thrpt    4  3.182 ± 3.664  ops/s
```
