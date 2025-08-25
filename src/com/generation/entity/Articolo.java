package com.generation.entity;

import java.time.LocalDate;


public class Articolo {
    private String titolo;
    private LocalDate dataAcquisto;
    private final int barcode;

    private static int numeroArticoli = 0;
    private static int barcodeIniziale = 1000;

    public Articolo() {
        this.barcode = barcodeIniziale++;
        numeroArticoli++;
    }

    public Articolo(String titolo, LocalDate dataAcquisto) {
        this.titolo = titolo;
        this.dataAcquisto = dataAcquisto;
        this.barcode = barcodeIniziale++;
        numeroArticoli++;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataAcquisto() {
        return dataAcquisto;
    }

    public void setDataAcquisto(LocalDate dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }

    public int getBarcode() {
        return barcode;
    }

    public static int getNumeroArticoli() {
        return numeroArticoli;
    }
    
    public static int confronta(Articolo a, Articolo b) {
    	return a.getDataAcquisto().compareTo(b.getDataAcquisto());
    }
}