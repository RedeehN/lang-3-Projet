

SRCDIR=sources/
TESTDIR=test/
BUILDDIR=build/

SRCDIRS=ast/

SOURCES=$(foreach dir, $(SRCDIRS), $(wildcard $(SRCDIR)$(dir)*.java))

TESTS=$(wildcard tests/*.java)

PARSER=sources/Parser/Jagger.jj
PARSERSOURCESDIR=$(BUILDDIR)Parser/
PARSERSOURCES=$(PARSERSOURCESDIR)*.java

APPS=sources/Main.java

JAVACC=javacc
JAVAC=javac
JAVA=java
RM=rm -rf
MKDIR=mkdir -p

.PHONY : all build echo directories build-apps build-package build-parser generate-parser build-tests

all : build

build : directories build-package build-parser build-apps build-tests

build-package :
	$(JAVAC) -d $(BUILDDIR) $(SOURCES)

generate-parser :
	$(JAVACC) -OUTPUT_DIRECTORY=$(PARSERSOURCESDIR) $(PARSER)

build-parser : generate-parser
	$(JAVAC) -d $(BUILDDIR) -cp $(BUILDDIR) $(PARSERSOURCES)

build-apps :
	$(JAVAC) -d $(BUILDDIR) -cp $(BUILDDIR) $(APPS)

build-tests :
	$(JAVAC) -d $(BUILDDIR) -cp $(BUILDDIR) $(TESTS)

clean :
	$(RM) $(BUILDDIR)*

echo :
	@echo $(TESTS)

directories : 
	@ $(MKDIR) $(BUILDDIR)