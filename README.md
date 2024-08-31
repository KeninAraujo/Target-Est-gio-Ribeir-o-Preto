# Target-Est-gio-Ribeir-o-Preto

##Observação: as atividades de programação estão localizadas em src/teste

4) Descubra a lógica e complete o próximo elemento:
a) 1, 3, 5, 7, (9) - apenas números ímpares
b) 2, 4, 8, 16, 32, 64, (128) - sempre o dobro do número que antecede
c) 0, 1, 4, 9, 16, 25, 36, (49) - soma do próximo núnero ímpar com o número anterior
d) 4, 16, 36, 64, (100) - cada número da sequência é o quadrado de cada par
e) 1, 1, 2, 3, 5, 8, (13) - sequência de Fibonacci
f) 2,10, 12, 16, 17, 18, 19, (200) - todos começam com a letra "D"


5) Você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. Você não pode ver as lâmpadas da sala em que está, mas pode ligar e desligar os interruptores quantas vezes quiser. Seu objetivo é descobrir qual interruptor controla qual lâmpada. Como você faria para descobrir, usando apenas duas idas até uma das salas das lâmpadas, qual interruptor controla cada lâmpada?

    Resposta:
    Primeiro ligo o interruptor 1 e deixo ligado por um tempo, após isso, ligo o interruptor 2 e desligo o interruptor 1. Agora basta verificar:
    
    PRIMEIRA IDA PARA SALA DA LÂMPADA A:
    se estiver quente, o interruptor 1 é o correspondente
    se estiver apagada, o interruptor 3 é o correspondente
    e se estiver acesa o interruptor 2 é o correspondente
    
    
    Volta para a sala das lâmpadas, desligo o interruptor 2 e ligo o interruptor 3 e aguardo alguns minutos 
    
    SEGUNDA IDA PARA A SALA DA LÂMPADA A:
    levando em consideração que se a lâmpada A estava inicialmente apagada e fria na primeira ida. E se agora ela estiver acesa é possível confirmar que ela é controlada pelo interruptor 3
    
    caso contrário, o interruptor 3 é correspondente a última lâmpada restando que não foi verificada 
