JCC = javac
JFLAGS = -g

MAIN_SRCS = *.java
MAIN_CLASSES = $(MAIN_SRCS:.java=.class)


.PHONY: all clean

all: main
main: $(MAIN_CLASSES)

$(MAIN_CLASSES): $(MAIN_SRCS)
	$(JCC) $(JFLAGS) $(MAIN_SRCS)

clean:
	$(RM) *.class