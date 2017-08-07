#! /bin/bash

stdinArray="$(cat <&0)"
# --- Build
mkdir ./out &> /dev/null
javac -d ./out ./src/*/*/*.java


ALGORITHM=$1

QUI="quiSort"
SEQ="seqSort"

if [ -z $ALGORITHM ] 
then
	echo "Algoritmo deve ser informado. Escolha entre quiSort e seqSort"
	exit
fi 

case $ALGORITHM in
	"quiSort")
		# out/ is the binaries folder.
		java -cp out/ -Xmx2048m algoritmo/sorting/QuiSort $stdinArray;;
	"seqSort")
		java -cp out/ -Xmx2048m algoritmo/sorting/SeqSort $stdinArray;;
	*) echo "Algoritmo inválido. Escolha entre quiSort e seqSort." ;;
esac

