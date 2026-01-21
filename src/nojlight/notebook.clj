(ns nojlight.demo
  (:require [scicloj.tableplot.v1.plotly :as plotly]
            [tablecloth.api :as tc]))
            ;;[tablecloth.column.api :as tcc]
            ;;[tech.v3.datatype.datetime :as datetime]
            ;;[tech.v3.dataset.print :as print]
            ;;[scicloj.kindly.v4.kind :as kind]
            ;;[scicloj.kindly.v4.api :as kindly]
            ;;[scicloj.metamorph.ml.rdatasets :as rdatasets]
            

(def the-data (tc/dataset {:x (range 100)
                           :y (repeatedly 100 #(rand-int 1000))
                           :trend (take 100 (cycle ["A" "B" "C"]))}))

the-data

(-> the-data
    (plotly/layer-point
     {:=x :x
      :=y :y
      :=color :trend
      :=mark-size 20
      :=mark-opacity 0.6}))

;;I added this live from the browser dude
{:hello :noj}
