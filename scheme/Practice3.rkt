;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname Practice3) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(+ 8.5 (* 3 (- 2 (/ 4 5))))
(+ (* 4 3) (+ 10 (* 2 3)))
(car' ((a b) (c d)))
(cdr (car'(( a b) (c d ))))

(define (YY n)
  (if (< n 0)
      (- n)
      n ))
(YY -12)

(define (myCube n)
  (* n n n))
(myCube 3)

(define (greaterThanZero x)
   (if (< 0 x)
       x
       "Too Bad"))
(greaterThanZero -1)


(cond (( = 3 4) '(this day))
      (( < 2 5) '(nowhere man))
      (else ' (none of us)))