(ns code-katas-1.core)


(defn filter-odd
  "Escribir una funcion que retorne solamente los numeros impares de
   una secuencia"
 [s]
 (filter(complement even?) s))





(defn nil-key
  "Escribir una funcion que dada una clave y un mapa, devuelva true, solamente si el mapa
   contiene una entrada con esa clave, y su valor es nil"
  [k m]
  (if (contains? m k) 
  (= (m k) nil) 
  false)
)

(defn implement-range
  "Escribir una funcion que cree una lista de enteros en un rango dado.
   Restricciones: range"
  [start end]
  (take-while(partial > end)(iterate inc start)))
  
(defn compress-sequence
  "Escribir una funcion que elimine los duplicados consecutivos
   de una secuencia"
  [s]
  (reduce #(if-not (= (last %1) %2)
  (conj %1 %2)%1)[]s)
  )

(defn max-value
  "Escribir una funcion que reciba un numero variable de parametros
   y retorne el que tenga el valor mayor
   Restricciones: max y max-key"
  [& args]
 (last(sort args)))
  
(defn split-two
  "Escribir una funcion que parta una secuencia en dos partes
   Restricciones: split-at"
  [length s]
  [(take length s)(drop length s)]
  
  
  
  
  )

(defn inter-two
  "Escribir una funcion que reciba dos secuencias y retorne el primero de cada una,
   luego el segundo de cada una, luego el tercero, etc.
   Restricciones: interleave"
  [s1 s2]
  (mapcat vector s1 s2)
  )

(defn retrieve-caps
  "Escribir una funcion que reciba un string y devuelva un nuevo string conteniendo
   solamente las mayusculas."
  [text]
  
  (apply str (filter #(Character/isUpperCase %) text))
  
  
  
  )

(defn find-truth
  "Escribir una funcion que tome un numero variable de booleans, y devuelva true
   solamente si alguno de los parametros son true, pero no todos son true. En otro
   caso debera retornar false"
  [& xs]
  (if(and(some true? xs)(some false? xs))true false)
  
  
  
  
  )
   

(defn zip-map
  "Escribir una funcion que reciba un vector de claves y un vector de valores, y
   construya un mapa a partir de ellos.
   Restricciones: zipmap"
  [k v]
  (into{} (map vec (partition 2 (interleave k v))))
  )
  
