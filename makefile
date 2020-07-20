doc/ :
	javadoc *.java
	mkdir doc
	mv *.html *.css *.js *.zip element-list jquery/ resources/ deck/ doc

deck/ :
	javac -d . *.java

all : doc/ deck/

clean : 
	rm -rf doc/
	rm -rf deck/
