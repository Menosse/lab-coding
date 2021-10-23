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

O maven ira perguntar qual tipo e archetype deve ser criado
```Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 1828: ```

O archetype a ser utilizado sera "quickstart"
```quickstart```

Dentre os archetypes "quickstart" escolher "112" para a aula 1
```Choose a number or apply filter (format: [groupId:]artifactId, case sensitive contains): 112:```
```112```

Versao do archetype a ser utilizada?
```Choose org.apache.maven.archetypes:maven-archetype-quickstart version:```

Escolha a mais recente
```8```

```Define value for property 'groupId': fit```
```Define value for property 'artifactId': hello```
```Define value for property 'version' 1.0-SNAPSHOT: : ```
```Define value for property 'package' fit: : br.com.fit```
``` Y: : ```