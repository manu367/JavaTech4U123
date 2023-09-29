package com.javatech.javatech4uwithfullconfig.data_source_opterations.models;

import jakarta.persistence.Column;

public class PagesModel {
    String pagetitle;
    String pagetype;
    @Column(length = 1000000)
    String pageDescription;
}
