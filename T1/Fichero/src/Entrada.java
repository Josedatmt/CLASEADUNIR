import java.io.File;
import java.io.IOException;

public class Entrada {

    public static void main(String[] args) {


        // 1 -> Obtener todos los nombre de los ficheros del directorio llamado directorio

        File ficherodirectorio = new File("src/resources/directorio");
        File[] nombreficheros = ficherodirectorio.listFiles();
         if (nombreficheros != null) {
        for (File fichero : nombreficheros) {
          System.out.println(fichero.getName());
        }
         } else {
           System.out.println("El directorio no existe o está vacío.");

        // 2 -> Crear una subcarpeta en el directorio llamado directorio y crear en ella un fichero


        File directorio = new File("src/resources/directorio");

        File subcarpeta = new File(directorio, "subcarpeta");
        subcarpeta.mkdirs();

        File fichero = new File(subcarpeta, "archivo.txt");
              try {
                       if (fichero.createNewFile()) {
                System.out.println("Archivo creado dentro de la subcarpeta.");
              } else {
                   System.out.println("El archivo ya existe.");
               }
                   } catch (IOException e) {
               System.out.println("Error al crear el archivo.");



                  //2.1 Obtener todos los nombre de los ficheros del directorio llamado directorio y el subdirectorio creado

                  File ficherosdirectorio = new File("src/resources/directorio");
                  File[] ficherodirectorio1 = ficherosdirectorio.listFiles();

                  if (ficherodirectorio != null) {
                   for (File fichero1 : ficherodirectorio1) {
                   System.out.println(fichero.getName());

                    if (fichero.isDirectory()) {
                     File[] archivosSubdirectorio = fichero.listFiles();
                       if (archivosSubdirectorio != null) {
                             for (File archivo : archivosSubdirectorio) {
                                System.out.println(archivo.getName());
                             }
                       }}}
                   } else {
                     System.out.println("El directorio no existe o está vacío.");


                  //3 -> Listar el nombre de todos los ficheros del SISTEMA ( C:/home o /home )

                File ficherosSistema = new File("/home");

                 if (ficherosSistema.exists() && ficherosSistema.isDirectory()) {
                 File[] ficheros = ficherosSistema.listFiles();
                if (ficheros != null) {
                    for (File fichero1 : ficheros) {
                        System.out.println(fichero.getName());

                    }
                }
                 }
                  }
              }
         }
    }
}
































        //2.1 Obtener todos los nombre de los ficheros del directorio llamado directorio y el subdirectorio creado


        //File ficherosdirectorio = new File("src/resources/directorio");
        // File[] ficherodirectorio = ficherosdirectorio.listFiles();
        // if (ficherodirectorio != null) {
        //  for (File fichero : ficherodirectorio) {

        //    System.out.println(fichero.getName());


        //   if (fichero.isDirectory()) {
        //      File[] archivosSubdirectorio = fichero.listFiles();
        //      if (archivosSubdirectorio != null) {
        //             for (File archivo : archivosSubdirectorio) {
        //                 System.out.println(archivo.getName());
        //           }
        //      }
        //      }
        //   }
        // } else {
        //   System.out.println("El directorio no existe o está vacío.");
        // }
        // }
//}






































                // 1 -> Obtener todos los nombre de los ficheros del directorio llamado directorio

                //File ficherodirectorio = new File("src/resources/directorio");
                //File[] nombreficheros = ficherodirectorio.listFiles();
                // if (nombreficheros != null) {
                // for (File fichero : nombreficheros) {
                //   System.out.println(fichero.getName());
                //}
                // } else {
                //   System.out.println("El directorio no existe o está vacío.");
                //}}
                //}





// 2 -> Crear una subcarpeta en el directorio llamado directorio y crear en ella un fichero


//File directorio = new File("src/resources/directorio");

//File subcarpeta = new File(directorio, "subcarpeta");
                //      subcarpeta.mkdirs();

//File fichero = new File(subcarpeta, "archivo.txt");
                //    try {
                //            if (fichero.createNewFile()) {
                //    System.out.println("Archivo creado dentro de la subcarpeta.");
                //  } else {
                //        System.out.println("El archivo ya existe.");
                //   }
                //         } catch (IOException e) {
                //   System.out.println("Error al crear el archivo.");
                // }}}


















                // FILE -> fichero logico -> fisico
                // fichero logico
                // File ficheroSinPuntero = new File("/home/josedaniel/Documentos/GitHub/CLASEADUNIR/T1/Fichero/src/resources/directorio/ejemplo_fichero.md");
                // File ficheroSinPuntero = new File("src/resources/directorio");
                // System.out.println(ficheroSinPuntero.getName());
                // System.out.println(ficheroSinPuntero.getParent());
                // System.out.println(ficheroSinPuntero.length());
                // System.out.println(ficheroSinPuntero.exists());
                // System.out.println(ficheroSinPuntero.isDirectory());
                // File[] -> todos los FICHEROS que estan dentro del directorio
                //ficheroSinPuntero.listFiles();
                // String[] -> todas las rutas de los FICHEROS que estan dentro del directorio
                // ficheroSinPuntero.list();


                // RECURSIVIDAD


        /* if (!ficheroSinPuntero.exists()) {
            try {
                ficheroSinPuntero.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo en la creacion del fichero");
            }
        }*/









                // 2 -> Crear una subcarpeta en el directorio llamado directorio y crear en ella un fichero


                // File directorio = new File("directorio");

                // Crear la subcarpeta dentro del directorio principal
                //  File subcarpeta = new File(directorio, "subcarpeta");
                // subcarpeta.mkdirs(); // Crear la subcarpeta si no existe

                // Crear un archivo dentro de la subcarpeta
                // File archivo = new File(subcarpeta, "archivo.txt");
                // try {
                //   if (archivo.createNewFile()) {
                //       System.out.println("Archivo creado dentro de la subcarpeta.");
                // } else {
                //       System.out.println("El archivo ya existe.");
                //   }
                // } catch (IOException e) {
                //    System.out.println("Error al crear el archivo.");
                // }


                //   -> Obtener todos los nombre de los ficheros del directorio llamado directorio y el subdirectorio creado




                //    File directorio = new File("directorio");
                //    File[] fichero1 = directorio.listFiles();
                //    if (ficheros != null) {
                //       for (File fichero : ficheros) {
                //        System.out.println(fichero.getName());
                // Si es un directorio, listar los archivos dentro de ese subdirectorio
                //     if (fichero.isDirectory()) {
                //          File[] archivosSubdirectorio = fichero.listFiles();
                //          if (archivosSubdirectorio != null) {
                //            for (File archivo : archivosSubdirectorio) {
                //                   System.out.println("   " + archivo.getName());
                //                }
                //          }
                //        }
                //    }
                //    } else {
                //       System.out.println("El directorio no existe o está vacío.");
                //    }}}

                // 3 -> Listar el nombre de todos los ficheros del SISTEMA ( C:/User o /Users )





                // RECURSIVIDAD


        /* if (!ficheroSinPuntero.exists()) {
            try {
                ficheroSinPuntero.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo en la creacion del fichero");
            }
        }*/


