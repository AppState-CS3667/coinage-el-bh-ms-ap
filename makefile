
JUNIT5_JAR = junit-platform-console-standalone-1.2.0.jar 
JUNIT5_RUNNER = org.junit.platform.console.ConsoleLauncher
JFLAGS = -d bin -sourcepath src

default:
	@echo "'make clean' removes *.class *~ files"
	@echo "'make compile' compiles all Java files"
	@echo "'make demo' runs coin demo with no command line args"
	@echo "'make demoUSD' runs coin demo USD command line arg"
	@echo "'make demoGBP' runs coin demo GBP command line arg"
	@echo "'make demoEUR' runs coin demo EUR command line arg"
	@echo "'make demoCAD' runs coin demo CAD command line arg"

clean:
	rm -f bin/*/*.class
	rm -f bin/*.class
	rm -f src/*~
	rm -f *~

compile: junit-platform-console-standalone-1.2.0.jar 
	javac $(JFLAGS) -cp .:junit-platform-console-standalone-1.2.0.jar src/*/*.java
	javac $(JFLAGS) -cp .:junit-platform-console-standalone-1.2.0.jar src/*.java

demo: 
	java -cp bin Demo
demoUSD:
	java -cp bin Demo USD
demoGBP:
	java -cp bin Demo GBP
demoEUR:
	java -cp bin Demo EUR
demoCAD:
	java -cp bin Demo CAD

test: junit-platform-console-standalone-1.2.0.jar 
	java -cp .:bin:junit-platform-console-standalone-1.2.0.jar org.junit.platform.console.ConsoleLauncher --scan-class-path


