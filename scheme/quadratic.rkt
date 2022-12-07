;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname quadratic) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
; Grant Commodore

; Solves a quadratic equation, given values for a, b, and c.
(define (quadratic a b c)
  ; Calculate the discriminant
  (let ((discriminant (- (* b b) (* 4 a c))))
    ; If the discriminant is less than 0, then the roots are complex.
    (if (negative? discriminant)
        (printf (string-append (number->string (/ (- b) (* a 2))) " ± " (number->string(/ (sqrt (- discriminant)) (* 2 a))) "i" "~n"))
        (let ((a2 (+ a a)))
          ; If the discriminant is 0, then the roots are the same.
          (if (zero? discriminant)
              (printf (string-append (number->string (/ (- b) a2)) "~n"))
              ; If the discriminant is greater than 0, then the roots are real.
              (let ((root (sqrt discriminant)))
                (printf (string-append (number->string (/ (- root b) a2)) ", " (number->string (/ (- (- root) b) a2)) "~n"))))))))

(quadratic 1 0 -25)
(quadratic 1 2 12)
(quadratic 1 8 16)
(quadratic 2 16 32)
(quadratic 2 1 3)

(quadratic 1 0 25)
