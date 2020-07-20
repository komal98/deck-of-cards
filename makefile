doc/ :
	javadoc *.java
	mkdir doc
	mv *.html *.css *.js *.zip element-list jquery/ resources/ deck/ doc

deck/ :
	javac *.java

all : doc/ deck/

clean : 
	sudo rm -rf doc/
	sudo rm -rf deck/
