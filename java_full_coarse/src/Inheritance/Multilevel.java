/*
 * package Inheritance; class A { int a,b,c; void Add() { a=10; b=20; c=a+b;
 * System.out.println("Sum of two number: "+c ); } void sub() { a=200; b=100;
 * c=a-b; System.out.println("sub of two number: "+c); } } class B extends A {
 * void div() { a=20; b=2; c=a/b; System.out.println("div of two number: "+c); }
 * } class C extends B { void rem() { a=10; b=3; c=a%b;
 * System.out.println("rem: "+c); } } public class Multilevel {
 *
 * public static void main(String[] args) { C s =new C(); s.Add(); s.div();
 * s.rem(); s.sub();
 *
 * } }
 *
 */