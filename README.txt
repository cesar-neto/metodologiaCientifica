O algoritmo de ordenação usado foi o quickSort, sequencial do MergeSort e paralelo MergeSort.

Pré-condição:
* Lembre-se que caso o ordenar.sh tiver permissão ele pode não rodar.
chmod +x ordenar.sh
* Tenha o caminho do arquivo de entrada e do arquivo de saida. OBS: Devem existir.
* Certifique-se de está na pasta do arquivo ordenar.sh ou que esteja configurado na variável de ambiente($PATH).

Algoritmos:
* MergeSort Sequencial: seqSort
* QuickSort : quiSort
* MergeSort Paralelo: parSort

Template:
./ordenar seqSort < path_entrada > path_saida
./ordenar quiSort < path_entrada > path_saida
./ordenar parSort < path_entrada > path_saida


Execução exemplo:
* Para executar o QuickSort
./ordenar.sh quiSort < /home/fulano/entrada.txt > /home/fulano/saida.txt

* Para executar o MergeSort Sequencial
./ordenar.sh seqSort < /home/fulano/entrada.txt > /home/fulano/saida.txt

* Para executar o MergeSort Paralelo
./ordenar.sh parSort < /home/fulano/entrada.txt > /home/fulano/saida.txt
