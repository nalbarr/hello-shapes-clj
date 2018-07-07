(ns hello-shapes-clj.core
  (:gen-class))

(defn -main
  "Simple main entry point to console app."
  [& args]
  (println "Hello, shapes!"))

  ;;(assert (= (area :square 4) 16) )
  ;;(assert (= (area :circle 3) (* 3 3 Math/PI) )
  ;;(assert (= (area :triangle 3 5) (/ 15 2) ) )

(defmulti area (fn [shape & _]
  shape))

(defmethod area :square
  [_ side]
  (* side side))

(defmethod area :circle
  [_ radius]
  (* radius radius Math/PI))

(defmethod area :triangle
  [_ b h]
  (* 1/2 b h))