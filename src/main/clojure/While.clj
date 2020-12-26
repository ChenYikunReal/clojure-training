(ns While)

(def x (atom 1))
(while ( < @x 5 )
  (do
    (println @x)
    (swap! x inc)))

