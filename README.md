# labcoding
lab coding java

# Subir maquina vagrat

```vagrant up```

# Acessar a maquina

``` vagrant ssh```


# Instalar o java e maven

```sdk install java 17-open```

```sdk install maven```

# Iniciar o projeto da aula 1

```cd /vagrant```

```mkdir Projects && cd Projects```

```mkdir fit && cd fit```

```mvn archetype:generate```

O maven ira perguntar qual tipo e archetype deve ser criado, digite "quickstart"
```Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 1828:```
```quickstart```

Dentre os archetypes "quickstart" escolher "112" para a aula 1
```Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 112:```
```112```

Versao do archetype a ser utilizada? Escolha a mais recente
```Choose org.apache.maven.archetypes:maven-archetype-quickstart version:```
```8```

Em seguida defina as propriedades a seguir
```Define value for property 'groupId':```
```fit```

```Define value for property 'artifactId':```
```hello```

```Define value for property 'version' 1.0-SNAPSHOT: :```
```⏎```

```Define value for property 'package' fit: :```
```br.com.fit```

``` Y: :```
```⏎```

## Testando a aplicacao

Apos criar o projeto rode o comando de teste do maven
```mvn test -f "hello/pom.xml"```