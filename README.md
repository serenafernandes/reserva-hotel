# Reserva de Hotel

Esta aplicação contempla a solução do problema Reserva de Hotel:

	Uma rede de hoteis operando em Belo Horizonte deseja oferecer serviços de reserva online.
    Eles possuem três hotéis: The Carlyle, The Plaza e Royal Hotel.
    Cada hotel tem preços diferentes durante a semana e final de semana.
    Existem ainda preços diferenciados para clientes vip.

### Instalação do ambiente

1- O projeto utiliza java 1.7, portanto é preciso o download do [jdk7](http://www.oracle.com/technetwork/pt/java/javase/downloads/jdk7-downloads-1880260.html) ou superior.

Adicione o diretório do java nas suas variáveis de ambiente

```bash
export JAVA_HOME=<caminho-para-o-java>
```
2- Clone do github (isso vai criar uma cópia do Reserva de Hotel no seu diretório atual)

```bash
git clone https://github.com/serenafernandes/reserva-hotel.git
```

3- Faça o download do [Gradle](https://services.gradle.org/distributions/gradle-2.10-bin.zip).

Descompacte o arquivo gradle-2.10-bin.zip.
Adicione o local escolhido para o gradle nas variáveis de ambiente como GRADLE_HOME, colocando seu diretório bin no PATH

```bash
export GRADLE_HOME="<caminho-para-o-gradle>"
export PATH="$PATH:$GRADLE_HOME/bin"
```

###Compilar

```bash
gradle build
```
###Rodar os testes

```bash
gradle test
```
###Rodar a aplicação

Antes de rodar a aplicação, tenha certeza que já compilou o projeto. Entre no diretório "build/libs" pois é onde o Gradle salva o jar do projeto. Digite o comando:

```bash
cd build/libs
```

Então execute o arquivo .jar, com o seguinte comando:
```bash
java -jar reserva-hotel-1.0.jar
```

O projeto também pode ser executado por:
```bash
gradle run
```

####Exemplos

	1. Cliente: Regular
	Período de estadia: 16Mar2015(seg), 17Mar2015(ter), 18Mar2015(qua)
	Saída esperada: The Carlyle: R$330
	
	2. Cliente: Regular
	Período de estadia: 20Mar2015(sex), 21Mar2015(sab), 22Mar2015(dom)
	Saída esperada: The Plaza: R$280

	3. Cliente: Vip
	Período de estadia: 26Mar2015(qui), 27Mar2015(sex), 28Mar2015(sab)
	Saída esperada: Royal Hotel: R$240
