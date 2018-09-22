package br.com.iamepp.sfgpetclinic.services.inmemory

interface InMemoryIDManager<T> {
    fun getNextKey(): T
}
