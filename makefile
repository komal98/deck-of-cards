doc/ :
	javadoc *.java
	mkdir doc
	mv *.html *.css *.js *.zip element-list jquery/ resources/ deck/ doc

Card.class : Suit.class FaceValue.class
	javac -d . Card.java

Deck.class : Card.class
	javac -d . Deck.java

Suit.class : 
	javac -d . Suit.java

FaceValue.class : 
	javac -d . FaceValue.java

StandardValueRanking.class : FaceValue.class
	javac -d . StandardValueRanking.java

all : doc/ Card.class Deck.class StandardValueRanking.class

clean : 
	sudo rm -rf doc/
	sudo rm -rf deck/
