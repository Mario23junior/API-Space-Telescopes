<p align="center"><img src="doc/logo-doc.gif" width = "723px" height="333px"></p>

<h1 align="center">API Space Telescopes</h1>

<h3 align="center">
API de consulta  de telescópios  espaciais, e micções realizadas com o objetivo de exploração espacial
 <p align="center">
 
<a href="https://www.travis-ci.com/github/Mario23junior/Api-Nebulosas/pull_requests" target="_blank"><img src="https://www.travis-ci.com/Mario23junior/Api-Nebulosas.svg?branch=main">
<a href="https://en.wikipedia.org/wiki/Representational_state_transfer"><img src="https://img.shields.io/badge/interface-REST-brightgreen.svg?longCache=true&style=flat-square" target="_blank"></a>
</p>

## Etapas para testar ou reproduzir

## Primeiro execute o maven 
 
```
 mvn package
```
## Em seguida faça
```
java -jar target/telecopeEspace-API-1.0-SNAPSHOT.jar

```

## Uso

```
http://localhost:8080/v1/api/base/telescope/
```

## Resultado dos dados de listagem de telescopios 

```json
 [
    {
        "id": 1,
        "nome": "Hubble",
        "img": "https://upload.wikimedia.org/wikipedia/commons/3/3f/HST-SM4.jpeg",
        "tipo": "Satélite",
        "missao": "Por intermédio do telescópio espacial Hubble, pretende-se investigar a composição e características físicas de corpos celestes, observar galáxias e estrelas para entender melhor a sua formação e levantar dados para a compreensão da história e evolução do Universo.",
        "durationMissao": "32 anos",
        "dataDelancamento": "24/04/1990",
        "status": "ativo"
    }
]

```

## Uso

```
http://localhost:8080/v1/api/propriedadesestruturais/
```
## Listando todos os dados de propriedades estruturais

```json
[
    {
        "id": 4,
        "comprimento": 13.2,
        "diametro": 4.2,
        "periastro": 537.4,
        "apoastro": 541.4,
        "distanciaFocal": 57.6,
        "telescopeSpaceDto": null
    }
]
```
 
 
 ## Uso

```
http://localhost:8080/v1/api/estruturaOrbital/
```
## Listando todos os dados de estruturaOrbital

```json
[
    {
        "id": 2,
        "decaimento": "2030,2040",
        "excentricidadeOrbital": 2.657E-4,
        "referenciaOrbital": "Geocêntrica",
        "periodoOrbital": "95.47",
        "inclinacaoOrbital": 28.47,
        "telescopeSpaceDto": null
    }
]
 
```
 ## Uso

```
http://localhost:8080/v1/api/estruturaobservacionais/
```
## Listando todos os dados de estrutura observacionais

```json

[
    {
        "id": 3,
        "massaDeLacamento": "11.10",
        "potenciaEletrica": 1.8,
        "geracaoDeEnergia": "Painéis solares fotovoltaicos",
        "comprimentoDeOndas": "Luz visível, raios gama, raios-X, infravermelho",
        "telescopeSpaceDto": null
    }
]
 
```
