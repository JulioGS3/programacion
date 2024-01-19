/*1. Fai un programa que cree as seguintes clase e métodos relacionados coa seguinte xerarquía de animais:
✗ Os mamíferos son unha clase abstracta cun método abstracto amamantarCrias(), que non devolve nada.
✗ As baleas forman unha clase, son mamíferos e implementan o método abstracto herdado: mostra
simplemente unha mensaxe indicando que esa balea amamanta ás súas crías.
✗ Os animais ovíparos son unha interface co método porOvos().
✗ O Ornitorrinco é un mamífero que pon ovos, polo que será unha clase filla de Mamífero, e implementará
a interfaz Ovíparo. O método herdado da clase nai debe amosar que o ornitorrinco amamanta ás súas
crías, e o método implementado desde a interface amosará que o ornitorrinco pon ovos.
Crea unha clase AppMamífero, na que crees 2 obxectos baleas, e 2 ornitorrinco e chames aos métodos
herdados/implementados. */
package UD4_2_interfaces_clasesAbstractas.Exercicio1;

    public abstract class Mamiferos {
    
    public abstract void amamantarCrias();
    
}

    

