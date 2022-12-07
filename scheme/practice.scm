;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname practice) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
; Grant Commodore

; Scheme Practice Quadratic & Temperature

; Quadratic function                                                                
(define (f x)
  (+ 3 (+(* x x) (* 2 x))))
(f 3)

; Cube a number
(define (cube x)
  (* x (* x x)))
(cube 3)

; Fahrenheit to Celcius
(define (f2c tempF)
  (* (- tempF 32) (/ 5 9)))
(f2c 32)

; Celcius to Fahrenheit
(define (c2f tempC)
  (+ (* tempC (/ 9 5)) 32))
(c2f 100)