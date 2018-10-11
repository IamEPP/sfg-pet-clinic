package br.com.iamepp.sfgpetclinic.services.inmemory

object LongInMemoryIDManager : InMemoryIDManager<Long> {
    private var currentKey: Long = 0
    override fun getNextKey(): Long {
        currentKey = currentKey.plus(1)
        return currentKey
    }
}
