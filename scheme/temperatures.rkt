;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname temperatures) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
; Grant Commodore

; Fahrenheit to Celcius
(define (f2c tempF)
  (* (- tempF 32) (/ 5 9)))

; Celcius to Fahrenheit
(define (c2f tempC)
  (+ (* tempC (/ 9 5)) 32))

(f2c 32)
(f2c 212)
(c2f 100)
(c2f 0)