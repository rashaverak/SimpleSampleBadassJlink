module com.example {

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.swing;
    requires javafx.web;
    requires javafx.graphics;
    requires javafx.base;
    requires javafx.media;

    requires gson;
    requires java.sql;

    requires ui;

    requires org.apache.commons.lang3;
    requires commons.validator;
    requires semver4j;
    requires java.uuid.generator;
    requires org.slf4j;
    requires java.logging;
    requires org.apache.httpcomponents.httpcore;
    requires org.apache.httpcomponents.httpclient;
    requires okhttp3;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.dataformat.yaml;
    requires com.fasterxml.jackson.databind;
    requires io.sentry;
    requires jdk.jsobject; //netscape.javascript
    requires junit;
    requires org.apache.commons.codec;
    requires annotations;
    requires com.google.common;

    //Vewd (vbox)
    requires vboxjws;
    requires java.xml.ws;



    //Unit tests
    requires jdk.httpserver;

}