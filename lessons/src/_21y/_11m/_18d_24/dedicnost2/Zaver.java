package _21y._11m._18d_24.dedicnost2;

// - V konstruktoru potomka musí být super() prvním příkazem, pokud ho použijeme.
// - V případě, že překrýváme metodu předka, zpomenutí na super. znamená rekurzivní
//   volání téže metody v téže třídě.
// - Pomocí super. se lze dostat pouze o jednu úroveň hierarchie výše. Nelze tedy
//   volat metodu "dědečka" např. pomocí super.super.tisk()
// - Lze vytvořit reference na abstraktní třídu, ale nelze pomocí new vytvořit
//   objekt abstraktní třídy.
// - Je-li jen jediná metoda označena jako abstract, musí být jako abstract
//   označena celá třída
// - Potomek nemůže přistupovat k private prvkům předka
public class Zaver {
}
