doc/ :
	javadoc *.java
	mkdir doc
	mv *.html *.css *.js *.zip element-list jquery/ resources/ doc

Card.class : Card.java Suit.java FaceValue.java
	javac Card.java

Deck.class : Deck.java Card.java Suit.java FaceValue.java
	javac Deck.java

StandardValueRanking.class : StandardValueRanking.java FaceValue.java
	javac StandardValueRanking.java

all : doc/ Card.class Deck.class StandardValueRanking.class

clean : 
	sudo rm -rf doc/
	rm *.class
