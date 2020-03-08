# hyperjaxb4

This is a fork of the [hyperjaxb3](https://github.com/highsource/hyperjaxb3) project. Which provides the ability to
generate entities from an XML schema.

All credits and cheers go to [highsource](https://github.com/highsource)!

## Goal

The goal of this fork is to make hyperjaxb3 compatible with JPA 2.1 (and future Jakarta development.) and to support
for older versions.

## Changes

For now I have only made the changes I personnaly need, which are:

- Clean up of old JPA code
- Removal of old code and tests
- Upgrade of dependencies
- Upgrade to JPA 2.1 namespaces
- Implemented `indexes` support for [@Table](https://docs.jboss.org/hibernate/jpa/2.1/api/javax/persistence/Table.html) annotation

## Documentation

The original documentation can be found here: https://github.com/highsource/hyperjaxb3/wiki/Customization_Guide

I have not updated any documentation, but the tests in this subproject will provide (some) documentation: [tests](test)

## Maven repository

Artifacts can be downloaded here: https://dev.azure.com/ninckblokje/open-pipelines/_packaging?_a=feed&feed=mvn-releases
