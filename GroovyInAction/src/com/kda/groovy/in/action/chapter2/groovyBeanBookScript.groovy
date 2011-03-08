#!/usr/bin/groovy

def groovyBook = new Book()

groovyBook.setTitle('Groovy conquers the World!')
assert groovyBook.getTitle() == 'Groovy conquers the World!'

groovyBook.title = 'Groovy in Action'
assert groovyBook.title == 'Groovy in Action'