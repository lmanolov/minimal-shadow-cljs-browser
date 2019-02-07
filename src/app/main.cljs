
(ns app.main
  (:require [app.lib :as lib]
    ["recharts" :refer (ResponsiveContainer BarChart Bar PieChart Pie Legend Tooltip Cell XAxis YAxis LabelList ComposedChart Line)]))

(def a 1)

(defonce b 2)

(defn main! []
  (println "[main]: loading"))

(defn reload! []
  (println "[main] reloaded lib:" lib/c lib/d)
  (println "[main] reloaded:" a b))
