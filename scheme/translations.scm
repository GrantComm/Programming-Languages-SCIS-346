;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname translations) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
; Translations

; ((3+4) * 5
(print (* (+ 3 4) 5))

(print ", ")

; 3 + (4 * 5)
( print (+ 3 (* 4 5)))

(print ", ")

; 2 * (3^2 + (6 - 3) * 4)
( print (* 2 (* 4 (+ (* 3 3) (- 6 3)))))
