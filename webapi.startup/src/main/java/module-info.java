/**
 * Created on 2/9/2018.
 */
open module george.stoica.webapi.startup {
    requires george.stoica.webapi.models;

    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.web;
    requires spring.webmvc;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires undertow.core;
    requires org.hibernate.validator;
    requires java.validation;
    requires java.sql;
    requires slf4j.api;
}