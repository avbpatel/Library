all:
	javac -g *.java

run: all
	java Main

clean:
	rm *.class
	rm Main
