# SPSMB 3AI ANJ2 - PRO/PRA
----------------------------
Automatické spuštění serveru PiskorkyServer pod ubuntu:
```
wget https://github.com/gitofson/spsmb_3ai_anj2/raw/main/lessons/src/_22y/_02m/_17d_46/piskorky/PiskorkyServer.java
wget https://github.com/gitofson/spsmb_3ai_anj2/raw/main/lessons/src/_22y/_02m/_17d_46/piskorky/PiskorkyStatus.java
#echo "Main-Class: cz/spsmb/b3i/w24/piskorky/PiskorkyServer.class" > MANIFEST.MF
mkdir -p cz/spsmb/b3i/w24/piskorky
javac PiskorkyStatus.java PiskorkyServer.java
rm  *.java
mv *.class cz/spsmb/b3i/w24/piskorky/
jar -c -e cz.spsmb.b3i.w24.piskorky.PiskorkyServer -f PiskorkyServer.jar cz
#java cz.spsmb.b3i.w24.piskorky.PiskorkyServer
java -jar PiskorkyServer.jar
```

